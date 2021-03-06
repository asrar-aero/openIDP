/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
package com.infosys.utilities.fxcopreport;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "target" })
public class Targets {
	@XmlElement(name = "Target")
	protected List<Target> target;

	public List<Target> getTarget() {
		if (target == null) {
			target = new ArrayList<Target>();
		}
		return this.target;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "modules" })
	public static class Target {
		@XmlElement(name = "Modules", required = true)
		protected Target.Modules modules;
		@XmlAttribute(name = "Name")
		protected java.lang.String name;

		public Target.Modules getModules() {
			return modules;
		}

		public void setModules(Target.Modules value) {
			this.modules = value;
		}

		public java.lang.String getName() {
			return name;
		}

		public void setName(java.lang.String value) {
			this.name = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "module" })
		public static class Modules {
			@XmlElement(name = "Module", required = true)
			protected Target.Modules.Module module;

			public Target.Modules.Module getModule() {
				return module;
			}

			public void setModule(Target.Modules.Module value) {
				this.module = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "messages", "namespaces" })
			public static class Module {
				@XmlElement(name = "Messages", required = true)
				protected Target.Modules.Module.Messages messages;
				@XmlElement(name = "Namespaces")
				protected Target.Modules.Module.Namespaces namespaces;
				@XmlAttribute(name = "Name")
				protected java.lang.String name;

				public Target.Modules.Module.Messages getMessages() {
					return messages;
				}

				public void setMessages(Target.Modules.Module.Messages value) {
					this.messages = value;
				}

				public Target.Modules.Module.Namespaces getNamespaces() {
					return namespaces;
				}

				public void setNamespaces(Target.Modules.Module.Namespaces value) {
					this.namespaces = value;
				}

				public java.lang.String getName() {
					return name;
				}

				public void setName(java.lang.String value) {
					this.name = value;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "message" })
				public static class Messages {
					@XmlElement(name = "Message")
					protected List<Target.Modules.Module.Messages.Message> message;

					public List<Target.Modules.Module.Messages.Message> getMessage() {
						if (message == null) {
							message = new ArrayList<Target.Modules.Module.Messages.Message>();
						}
						return this.message;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "issue" })
					public static class Message {
						@XmlElement(name = "Issue", required = true)
						protected Target.Modules.Module.Messages.Message.Issue issue;
						@XmlAttribute(name = "TypeName")
						protected java.lang.String typeName;
						@XmlAttribute(name = "Category")
						protected java.lang.String category;
						@XmlAttribute(name = "CheckId")
						protected java.lang.String checkId;
						@XmlAttribute(name = "Status")
						protected java.lang.String status;
						@XmlAttribute(name = "Created")
						protected java.lang.String created;
						@XmlAttribute(name = "FixCategory")
						protected java.lang.String fixCategory;

						public Target.Modules.Module.Messages.Message.Issue getIssue() {
							return issue;
						}

						public void setIssue(
								Target.Modules.Module.Messages.Message.Issue value) {
							this.issue = value;
						}

						public java.lang.String getTypeName() {
							return typeName;
						}

						public void setTypeName(java.lang.String value) {
							this.typeName = value;
						}

						public java.lang.String getCategory() {
							return category;
						}

						public void setCategory(java.lang.String value) {
							this.category = value;
						}

						public java.lang.String getCheckId() {
							return checkId;
						}

						public void setCheckId(java.lang.String value) {
							this.checkId = value;
						}

						public java.lang.String getStatus() {
							return status;
						}

						public void setStatus(java.lang.String value) {
							this.status = value;
						}

						public java.lang.String getCreated() {
							return created;
						}

						public void setCreated(java.lang.String value) {
							this.created = value;
						}

						public java.lang.String getFixCategory() {
							return fixCategory;
						}

						public void setFixCategory(java.lang.String value) {
							this.fixCategory = value;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "value" })
						public static class Issue {
							@XmlValue
							protected java.lang.String value;
							@XmlAttribute(name = "Name")
							protected java.lang.String name;
							@XmlAttribute(name = "Certainty")
							protected Byte certainty;
							@XmlAttribute(name = "Level")
							protected java.lang.String level;

							public java.lang.String getValue() {
								return value;
							}

							public void setValue(java.lang.String value) {
								this.value = value;
							}

							public java.lang.String getName() {
								return name;
							}

							public void setName(java.lang.String value) {
								this.name = value;
							}

							public Byte getCertainty() {
								return certainty;
							}

							public void setCertainty(Byte value) {
								this.certainty = value;
							}

							public java.lang.String getLevel() {
								return level;
							}

							public void setLevel(java.lang.String value) {
								this.level = value;
							}
						}
					}
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "namespace" })
				public static class Namespaces {
					@XmlElement(name = "Namespace", required = true)
					protected Target.Modules.Module.Namespaces.Namespace namespace;

					public Target.Modules.Module.Namespaces.Namespace getNamespace() {
						return namespace;
					}

					public void setNamespace(Target.Modules.Module.Namespaces.Namespace value) {
						this.namespace = value;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "types" })
					public static class Namespace {
						@XmlElement(name = "Types", required = true)
						protected Target.Modules.Module.Namespaces.Namespace.Types types;
						@XmlAttribute(name = "Name")
						protected java.lang.String name;

						public Target.Modules.Module.Namespaces.Namespace.Types getTypes() {
							return types;
						}

						public void setTypes(
								Target.Modules.Module.Namespaces.Namespace.Types value) {
							this.types = value;
						}

						public java.lang.String getName() {
							return name;
						}

						public void setName(java.lang.String value) {
							this.name = value;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "type" })
						public static class Types {
							@XmlElement(name = "Type")
							protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type> type;

							public List<Target.Modules.Module.Namespaces.Namespace.Types.Type> getType() {
								if (type == null) {
									type = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type>();
								}
								return this.type;
							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "messages", "members" })
							public static class Type {
								@XmlElement(name = "Messages", required = true)
								protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages messages;
								@XmlElement(name = "Members", required = true)
								protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members members;
								@XmlAttribute(name = "Name")
								protected java.lang.String name;
								@XmlAttribute(name = "Kind")
								protected java.lang.String kind;
								@XmlAttribute(name = "Accessibility")
								protected java.lang.String accessibility;
								@XmlAttribute(name = "ExternallyVisible")
								protected java.lang.String externallyVisible;

								public Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages getMessages() {
									return messages;
								}

								public void setMessages(
										Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages value) {
									this.messages = value;
								}

								public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members getMembers() {
									return members;
								}

								public void setMembers(
										Target.Modules.Module.Namespaces.Namespace.Types.Type.Members value) {
									this.members = value;
								}

								public java.lang.String getName() {
									return name;
								}

								public void setName(java.lang.String value) {
									this.name = value;
								}

								public java.lang.String getKind() {
									return kind;
								}

								public void setKind(java.lang.String value) {
									this.kind = value;
								}

								public java.lang.String getAccessibility() {
									return accessibility;
								}

								public void setAccessibility(java.lang.String value) {
									this.accessibility = value;
								}

								public java.lang.String getExternallyVisible() {
									return externallyVisible;
								}

								public void setExternallyVisible(java.lang.String value) {
									this.externallyVisible = value;
								}

								@XmlAccessorType(XmlAccessType.FIELD)
								@XmlType(name = "", propOrder = { "member" })
								public static class Members {
									@XmlElement(name = "Member")
									protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member> member;

									public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member> getMember() {
										if (member == null) {
											member = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member>();
										}
										return this.member;
									}

									@XmlAccessorType(XmlAccessType.FIELD)
									@XmlType(name = "", propOrder = { "messages", "accessors" })
									public static class Member {
										@XmlElement(name = "Messages")
										protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages messages;
										@XmlElement(name = "Accessors")
										protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors accessors;
										@XmlAttribute(name = "Name")
										protected java.lang.String name;
										@XmlAttribute(name = "Kind")
										protected java.lang.String kind;
										@XmlAttribute(name = "Static")
										protected java.lang.String _static;
										@XmlAttribute(name = "Accessibility")
										protected java.lang.String accessibility;
										@XmlAttribute(name = "ExternallyVisible")
										protected java.lang.String externallyVisible;

										public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages getMessages() {
											return messages;
										}

										public void setMessages(
												Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages value) {
											this.messages = value;
										}

										public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors getAccessors() {
											return accessors;
										}

										public void setAccessors(
												Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors value) {
											this.accessors = value;
										}

										public java.lang.String getName() {
											return name;
										}

										public void setName(java.lang.String value) {
											this.name = value;
										}

										public java.lang.String getKind() {
											return kind;
										}

										public void setKind(java.lang.String value) {
											this.kind = value;
										}

										public java.lang.String getStatic() {
											return _static;
										}

										public void setStatic(java.lang.String value) {
											this._static = value;
										}

										public java.lang.String getAccessibility() {
											return accessibility;
										}

										public void setAccessibility(java.lang.String value) {
											this.accessibility = value;
										}

										public java.lang.String getExternallyVisible() {
											return externallyVisible;
										}

										public void setExternallyVisible(java.lang.String value) {
											this.externallyVisible = value;
										}

										@XmlAccessorType(XmlAccessType.FIELD)
										@XmlType(name = "", propOrder = { "accessor" })
										public static class Accessors {
											@XmlElement(name = "Accessor")
											protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor> accessor;

											public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor> getAccessor() {
												if (accessor == null) {
													accessor = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor>();
												}
												return this.accessor;
											}

											@XmlAccessorType(XmlAccessType.FIELD)
											@XmlType(name = "", propOrder = { "messages" })
											public static class Accessor {
												@XmlElement(name = "Messages", required = true)
												protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages messages;
												@XmlAttribute(name = "Name")
												protected java.lang.String name;
												@XmlAttribute(name = "Kind")
												protected java.lang.String kind;
												@XmlAttribute(name = "Static")
												protected java.lang.String _static;
												@XmlAttribute(name = "Accessibility")
												protected java.lang.String accessibility;
												@XmlAttribute(name = "ExternallyVisible")
												protected java.lang.String externallyVisible;

												public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages getMessages() {
													return messages;
												}

												public void setMessages(
														Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages value) {
													this.messages = value;
												}

												public java.lang.String getName() {
													return name;
												}

												public void setName(java.lang.String value) {
													this.name = value;
												}

												public java.lang.String getKind() {
													return kind;
												}

												public void setKind(java.lang.String value) {
													this.kind = value;
												}

												public java.lang.String getStatic() {
													return _static;
												}

												public void setStatic(java.lang.String value) {
													this._static = value;
												}

												public java.lang.String getAccessibility() {
													return accessibility;
												}

												public void setAccessibility(java.lang.String value) {
													this.accessibility = value;
												}

												public java.lang.String getExternallyVisible() {
													return externallyVisible;
												}

												public void setExternallyVisible(java.lang.String value) {
													this.externallyVisible = value;
												}

												@XmlAccessorType(XmlAccessType.FIELD)
												@XmlType(name = "", propOrder = { "message" })
												public static class Messages {
													@XmlElement(name = "Message", required = true)
													protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message message;

													public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message getMessage() {
														return message;
													}

													public void setMessage(
															Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message value) {
														this.message = value;
													}

													@XmlAccessorType(XmlAccessType.FIELD)
													@XmlType(name = "", propOrder = { "issue" })
													public static class Message {
														@XmlElement(name = "Issue", required = true)
														protected Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message.Issue issue;
														@XmlAttribute(name = "TypeName")
														protected java.lang.String typeName;
														@XmlAttribute(name = "Category")
														protected java.lang.String category;
														@XmlAttribute(name = "CheckId")
														protected java.lang.String checkId;
														@XmlAttribute(name = "Status")
														protected java.lang.String status;
														@XmlAttribute(name = "Created")
														protected java.lang.String created;
														@XmlAttribute(name = "FixCategory")
														protected java.lang.String fixCategory;

														public Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message.Issue getIssue() {
															return issue;
														}

														public void setIssue(
																Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Accessors.Accessor.Messages.Message.Issue value) {
															this.issue = value;
														}

														public java.lang.String getTypeName() {
															return typeName;
														}

														public void setTypeName(java.lang.String value) {
															this.typeName = value;
														}

														public java.lang.String getCategory() {
															return category;
														}

														public void setCategory(java.lang.String value) {
															this.category = value;
														}

														public java.lang.String getCheckId() {
															return checkId;
														}

														public void setCheckId(java.lang.String value) {
															this.checkId = value;
														}

														public java.lang.String getStatus() {
															return status;
														}

														public void setStatus(java.lang.String value) {
															this.status = value;
														}

														public java.lang.String getCreated() {
															return created;
														}

														public void setCreated(java.lang.String value) {
															this.created = value;
														}

														public java.lang.String getFixCategory() {
															return fixCategory;
														}

														public void setFixCategory(java.lang.String value) {
															this.fixCategory = value;
														}

														@XmlAccessorType(XmlAccessType.FIELD)
														@XmlType(name = "", propOrder = { "value" })
														public static class Issue {
															@XmlValue
															protected java.lang.String value;
															@XmlAttribute(name = "Certainty")
															protected Byte certainty;
															@XmlAttribute(name = "Level")
															protected java.lang.String level;
															@XmlAttribute(name = "Path")
															protected java.lang.String path;
															@XmlAttribute(name = "File")
															protected java.lang.String file;
															@XmlAttribute(name = "Line")
															protected Byte line;

															public java.lang.String getValue() {
																return value;
															}

															public void setValue(java.lang.String value) {
																this.value = value;
															}

															public Byte getCertainty() {
																return certainty;
															}

															public void setCertainty(Byte value) {
																this.certainty = value;
															}

															public java.lang.String getLevel() {
																return level;
															}

															public void setLevel(java.lang.String value) {
																this.level = value;
															}

															public java.lang.String getPath() {
																return path;
															}

															public void setPath(java.lang.String value) {
																this.path = value;
															}

															public java.lang.String getFile() {
																return file;
															}

															public void setFile(java.lang.String value) {
																this.file = value;
															}

															public Byte getLine() {
																return line;
															}

															public void setLine(Byte value) {
																this.line = value;
															}
														}
													}
												}
											}
										}

										@XmlAccessorType(XmlAccessType.FIELD)
										@XmlType(name = "", propOrder = { "message" })
										public static class Messages {
											@XmlElement(name = "Message")
											protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message> message;

											public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message> getMessage() {
												if (message == null) {
													message = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message>();
												}
												return this.message;
											}

											@XmlAccessorType(XmlAccessType.FIELD)
											@XmlType(name = "", propOrder = { "issue" })
											public static class Message {
												@XmlElement(name = "Issue")
												protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message.Issue> issue;
												@XmlAttribute(name = "TypeName")
												protected java.lang.String typeName;
												@XmlAttribute(name = "Category")
												protected java.lang.String category;
												@XmlAttribute(name = "CheckId")
												protected java.lang.String checkId;
												@XmlAttribute(name = "Status")
												protected java.lang.String status;
												@XmlAttribute(name = "Created")
												protected java.lang.String created;
												@XmlAttribute(name = "FixCategory")
												protected java.lang.String fixCategory;
												@XmlAttribute(name = "Id")
												protected java.lang.String id;

												public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message.Issue> getIssue() {
													if (issue == null) {
														issue = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Members.Member.Messages.Message.Issue>();
													}
													return this.issue;
												}

												public java.lang.String getTypeName() {
													return typeName;
												}

												public void setTypeName(java.lang.String value) {
													this.typeName = value;
												}

												public java.lang.String getCategory() {
													return category;
												}

												public void setCategory(java.lang.String value) {
													this.category = value;
												}

												public java.lang.String getCheckId() {
													return checkId;
												}

												public void setCheckId(java.lang.String value) {
													this.checkId = value;
												}

												public java.lang.String getStatus() {
													return status;
												}

												public void setStatus(java.lang.String value) {
													this.status = value;
												}

												public java.lang.String getCreated() {
													return created;
												}

												public void setCreated(java.lang.String value) {
													this.created = value;
												}

												public java.lang.String getFixCategory() {
													return fixCategory;
												}

												public void setFixCategory(java.lang.String value) {
													this.fixCategory = value;
												}

												public java.lang.String getId() {
													return id;
												}

												public void setId(java.lang.String value) {
													this.id = value;
												}

												@XmlAccessorType(XmlAccessType.FIELD)
												@XmlType(name = "", propOrder = { "value" })
												public static class Issue {
													@XmlValue
													protected java.lang.String value;
													@XmlAttribute(name = "Certainty")
													protected Byte certainty;
													@XmlAttribute(name = "Level")
													protected java.lang.String level;
													@XmlAttribute(name = "Path")
													protected java.lang.String path;
													@XmlAttribute(name = "File")
													protected java.lang.String file;
													@XmlAttribute(name = "Line")
													protected Byte line;
													@XmlAttribute(name = "Name")
													protected java.lang.String name;

													public java.lang.String getValue() {
														return value;
													}

													public void setValue(java.lang.String value) {
														this.value = value;
													}

													public Byte getCertainty() {
														return certainty;
													}

													public void setCertainty(Byte value) {
														this.certainty = value;
													}

													public java.lang.String getLevel() {
														return level;
													}

													public void setLevel(java.lang.String value) {
														this.level = value;
													}

													public java.lang.String getPath() {
														return path;
													}

													public void setPath(java.lang.String value) {
														this.path = value;
													}

													public java.lang.String getFile() {
														return file;
													}

													public void setFile(java.lang.String value) {
														this.file = value;
													}

													public Byte getLine() {
														return line;
													}

													public void setLine(Byte value) {
														this.line = value;
													}

													public java.lang.String getName() {
														return name;
													}

													public void setName(java.lang.String value) {
														this.name = value;
													}
												}
											}
										}
									}
								}

								@XmlAccessorType(XmlAccessType.FIELD)
								@XmlType(name = "", propOrder = { "message" })
								public static class Messages {
									@XmlElement(name = "Message")
									protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message> message;

									public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message> getMessage() {
										if (message == null) {
											message = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message>();
										}
										return this.message;
									}

									@XmlAccessorType(XmlAccessType.FIELD)
									@XmlType(name = "", propOrder = { "issue" })
									public static class Message {
										@XmlElement(name = "Issue")
										protected List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message.Issue> issue;
										@XmlAttribute(name = "TypeName")
										protected java.lang.String typeName;
										@XmlAttribute(name = "Category")
										protected java.lang.String category;
										@XmlAttribute(name = "CheckId")
										protected java.lang.String checkId;
										@XmlAttribute(name = "Status")
										protected java.lang.String status;
										@XmlAttribute(name = "Created")
										protected java.lang.String created;
										@XmlAttribute(name = "FixCategory")
										protected java.lang.String fixCategory;
										@XmlAttribute(name = "Id")
										protected java.lang.String id;

										public List<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message.Issue> getIssue() {
											if (issue == null) {
												issue = new ArrayList<Target.Modules.Module.Namespaces.Namespace.Types.Type.Messages.Message.Issue>();
											}
											return this.issue;
										}

										public java.lang.String getTypeName() {
											return typeName;
										}

										public void setTypeName(java.lang.String value) {
											this.typeName = value;
										}

										public java.lang.String getCategory() {
											return category;
										}

										public void setCategory(java.lang.String value) {
											this.category = value;
										}

										public java.lang.String getCheckId() {
											return checkId;
										}

										public void setCheckId(java.lang.String value) {
											this.checkId = value;
										}

										public java.lang.String getStatus() {
											return status;
										}

										public void setStatus(java.lang.String value) {
											this.status = value;
										}

										public java.lang.String getCreated() {
											return created;
										}

										public void setCreated(java.lang.String value) {
											this.created = value;
										}

										public java.lang.String getFixCategory() {
											return fixCategory;
										}

										public void setFixCategory(java.lang.String value) {
											this.fixCategory = value;
										}

										public java.lang.String getId() {
											return id;
										}

										public void setId(java.lang.String value) {
											this.id = value;
										}

										@XmlAccessorType(XmlAccessType.FIELD)
										@XmlType(name = "", propOrder = { "value" })
										public static class Issue {
											@XmlValue
											protected java.lang.String value;
											@XmlAttribute(name = "Certainty")
											protected Byte certainty;
											@XmlAttribute(name = "Level")
											protected java.lang.String level;
											@XmlAttribute(name = "Name")
											protected java.lang.String name;

											public java.lang.String getValue() {
												return value;
											}

											public void setValue(java.lang.String value) {
												this.value = value;
											}

											public Byte getCertainty() {
												return certainty;
											}

											public void setCertainty(Byte value) {
												this.certainty = value;
											}

											public java.lang.String getLevel() {
												return level;
											}

											public void setLevel(java.lang.String value) {
												this.level = value;
											}

											public java.lang.String getName() {
												return name;
											}

											public void setName(java.lang.String value) {
												this.name = value;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
